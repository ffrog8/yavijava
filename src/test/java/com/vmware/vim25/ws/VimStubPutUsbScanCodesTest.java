package com.vmware.vim25.ws;

import com.vmware.vim25.ws.Argument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UsbScanCodeSpec;
import com.vmware.vim25.UsbScanCodeSpecKeyEvent;
import com.vmware.vim25.UsbScanCodeSpecModifierType;
import com.vmware.vim25.VimPortType;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class VimStubPutUsbScanCodesTest {

    @Test
    public void testPutUsbScanCodes_UsesOperationName_AndSerializesRepeatedKeyEvents() throws RemoteException, MalformedURLException {
        CapturingClient client = new CapturingClient();
        VimPortType vimPortType = new VimPortType(client);

        ManagedObjectReference vmMor = new ManagedObjectReference();
        vmMor.setType("VirtualMachine");
        vmMor.setVal("vm-123");

        UsbScanCodeSpecModifierType modifiers = new UsbScanCodeSpecModifierType();
        modifiers.setLeftShift(Boolean.TRUE);

        UsbScanCodeSpecKeyEvent event1 = new UsbScanCodeSpecKeyEvent();
        event1.setUsbHidCode(4);
        event1.setModifiers(modifiers);

        UsbScanCodeSpecKeyEvent event2 = new UsbScanCodeSpecKeyEvent();
        event2.setUsbHidCode(5);

        UsbScanCodeSpec spec = new UsbScanCodeSpec();
        spec.setKeyEvents(new UsbScanCodeSpecKeyEvent[] {event1, event2});

        int result = vimPortType.putUsbScanCodes(vmMor, spec);

        Assert.assertEquals(7, result);
        Assert.assertEquals("PutUsbScanCodes", client.lastMethodName);

        String payload = client.marshall(client.lastMethodName, client.lastArguments);
        Assert.assertTrue(payload.contains("<keyEvents>"));
        Assert.assertTrue(payload.indexOf("<keyEvents>") != payload.lastIndexOf("<keyEvents>"));
        Assert.assertTrue(payload.contains("<usbHidCode>4</usbHidCode>"));
        Assert.assertTrue(payload.contains("<usbHidCode>5</usbHidCode>"));
        Assert.assertTrue(payload.contains("<leftShift>true</leftShift>"));
    }

    private static class CapturingClient extends SoapClient {
        private String lastMethodName;
        private Argument[] lastArguments;

        private CapturingClient() {
            this.vimNameSpace = " xmlns=\"urn:vim25\"";
        }

        public Object invoke(String methodName, Argument[] paras, String returnType) {
            this.lastMethodName = methodName;
            this.lastArguments = paras;
            return Integer.valueOf(7);
        }

        public StringBuffer invokeAsString(String methodName, Argument[] paras) {
            this.lastMethodName = methodName;
            this.lastArguments = paras;
            return new StringBuffer();
        }
    }
}
