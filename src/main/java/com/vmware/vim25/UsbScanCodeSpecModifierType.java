/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

@SuppressWarnings("all")
public class UsbScanCodeSpecModifierType extends DynamicData {
    public Boolean leftControl;
    public Boolean leftShift;
    public Boolean leftAlt;
    public Boolean leftGui;
    public Boolean rightControl;
    public Boolean rightShift;
    public Boolean rightAlt;
    public Boolean rightGui;

    public Boolean isLeftControl() {
        return this.leftControl;
    }

    public Boolean isLeftShift() {
        return this.leftShift;
    }

    public Boolean isLeftAlt() {
        return this.leftAlt;
    }

    public Boolean isLeftGui() {
        return this.leftGui;
    }

    public Boolean isRightControl() {
        return this.rightControl;
    }

    public Boolean isRightShift() {
        return this.rightShift;
    }

    public Boolean isRightAlt() {
        return this.rightAlt;
    }

    public Boolean isRightGui() {
        return this.rightGui;
    }

    public void setLeftControl(Boolean leftControl) {
        this.leftControl = leftControl;
    }

    public void setLeftShift(Boolean leftShift) {
        this.leftShift = leftShift;
    }

    public void setLeftAlt(Boolean leftAlt) {
        this.leftAlt = leftAlt;
    }

    public void setLeftGui(Boolean leftGui) {
        this.leftGui = leftGui;
    }

    public void setRightControl(Boolean rightControl) {
        this.rightControl = rightControl;
    }

    public void setRightShift(Boolean rightShift) {
        this.rightShift = rightShift;
    }

    public void setRightAlt(Boolean rightAlt) {
        this.rightAlt = rightAlt;
    }

    public void setRightGui(Boolean rightGui) {
        this.rightGui = rightGui;
    }
}
