/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Don't edit this file!  It is auto-generated by frameworks/rs/api/gen_runtime.

package android.renderscript.cts;

import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import android.renderscript.Element;

public class TestStep extends RSBaseCompute {

    private ScriptC_TestStep script;
    private ScriptC_TestStepRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestStep(mRS);
        scriptRelaxed = new ScriptC_TestStepRelaxed(mRS);
    }

    public class ArgumentsFloatFloatFloat {
        public float inEdge;
        public float inV;
        public Floaty out;
    }

    private void checkStepFloatFloatFloat() {
        Allocation inEdge = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x598900c49184fbfel, false);
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x9aefccaa832f44e9l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInV(inV);
            script.forEach_testStepFloatFloatFloat(inEdge, out);
            verifyResultsStepFloatFloatFloat(inEdge, inV, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloatFloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInV(inV);
            scriptRelaxed.forEach_testStepFloatFloatFloat(inEdge, out);
            verifyResultsStepFloatFloatFloat(inEdge, inV, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloatFloatFloat: " + e.toString());
        }
    }

    private void verifyResultsStepFloatFloatFloat(Allocation inEdge, Allocation inV, Allocation out, boolean relaxed) {
        float[] arrayInEdge = new float[INPUTSIZE * 1];
        inEdge.copyTo(arrayInEdge);
        float[] arrayInV = new float[INPUTSIZE * 1];
        inV.copyTo(arrayInV);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 1 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inEdge = arrayInEdge[i];
                args.inV = arrayInV[i];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeStep(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inEdge: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inEdge, Float.floatToRawIntBits(args.inEdge), args.inEdge));
                    message.append("\n");
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 1 + j], Float.floatToRawIntBits(arrayOut[i * 1 + j]), arrayOut[i * 1 + j]));
                    if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkStepFloatFloatFloat" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkStepFloat2Float2Float2() {
        Allocation inEdge = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x6efefa297df69504l, false);
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x12eb000b8567f58bl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.set_gAllocInV(inV);
            script.forEach_testStepFloat2Float2Float2(inEdge, out);
            verifyResultsStepFloat2Float2Float2(inEdge, inV, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat2Float2Float2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.set_gAllocInV(inV);
            scriptRelaxed.forEach_testStepFloat2Float2Float2(inEdge, out);
            verifyResultsStepFloat2Float2Float2(inEdge, inV, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat2Float2Float2: " + e.toString());
        }
    }

    private void verifyResultsStepFloat2Float2Float2(Allocation inEdge, Allocation inV, Allocation out, boolean relaxed) {
        float[] arrayInEdge = new float[INPUTSIZE * 2];
        inEdge.copyTo(arrayInEdge);
        float[] arrayInV = new float[INPUTSIZE * 2];
        inV.copyTo(arrayInV);
        float[] arrayOut = new float[INPUTSIZE * 2];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inEdge = arrayInEdge[i * 2 + j];
                args.inV = arrayInV[i * 2 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeStep(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inEdge: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inEdge, Float.floatToRawIntBits(args.inEdge), args.inEdge));
                    message.append("\n");
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 2 + j], Float.floatToRawIntBits(arrayOut[i * 2 + j]), arrayOut[i * 2 + j]));
                    if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkStepFloat2Float2Float2" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkStepFloat3Float3Float3() {
        Allocation inEdge = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x9e548cd666a7a77l, false);
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x674fde2b8745f72cl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.set_gAllocInV(inV);
            script.forEach_testStepFloat3Float3Float3(inEdge, out);
            verifyResultsStepFloat3Float3Float3(inEdge, inV, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat3Float3Float3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.set_gAllocInV(inV);
            scriptRelaxed.forEach_testStepFloat3Float3Float3(inEdge, out);
            verifyResultsStepFloat3Float3Float3(inEdge, inV, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat3Float3Float3: " + e.toString());
        }
    }

    private void verifyResultsStepFloat3Float3Float3(Allocation inEdge, Allocation inV, Allocation out, boolean relaxed) {
        float[] arrayInEdge = new float[INPUTSIZE * 4];
        inEdge.copyTo(arrayInEdge);
        float[] arrayInV = new float[INPUTSIZE * 4];
        inV.copyTo(arrayInV);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inEdge = arrayInEdge[i * 4 + j];
                args.inV = arrayInV[i * 4 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeStep(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inEdge: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inEdge, Float.floatToRawIntBits(args.inEdge), args.inEdge));
                    message.append("\n");
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkStepFloat3Float3Float3" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkStepFloat4Float4Float4() {
        Allocation inEdge = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0xa4cb97714ede5feal, false);
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0xbbb4bc4b8923f8cdl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.set_gAllocInV(inV);
            script.forEach_testStepFloat4Float4Float4(inEdge, out);
            verifyResultsStepFloat4Float4Float4(inEdge, inV, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat4Float4Float4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.set_gAllocInV(inV);
            scriptRelaxed.forEach_testStepFloat4Float4Float4(inEdge, out);
            verifyResultsStepFloat4Float4Float4(inEdge, inV, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat4Float4Float4: " + e.toString());
        }
    }

    private void verifyResultsStepFloat4Float4Float4(Allocation inEdge, Allocation inV, Allocation out, boolean relaxed) {
        float[] arrayInEdge = new float[INPUTSIZE * 4];
        inEdge.copyTo(arrayInEdge);
        float[] arrayInV = new float[INPUTSIZE * 4];
        inV.copyTo(arrayInV);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inEdge = arrayInEdge[i * 4 + j];
                args.inV = arrayInV[i * 4 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeStep(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inEdge: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inEdge, Float.floatToRawIntBits(args.inEdge), args.inEdge));
                    message.append("\n");
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkStepFloat4Float4Float4" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkStepFloat2FloatFloat2() {
        Allocation inEdge = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0xb0ac06c45b3d8b26l, false);
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xfa7d66f2b6d48a21l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.set_gAllocInV(inV);
            script.forEach_testStepFloat2FloatFloat2(inEdge, out);
            verifyResultsStepFloat2FloatFloat2(inEdge, inV, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat2FloatFloat2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.set_gAllocInV(inV);
            scriptRelaxed.forEach_testStepFloat2FloatFloat2(inEdge, out);
            verifyResultsStepFloat2FloatFloat2(inEdge, inV, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat2FloatFloat2: " + e.toString());
        }
    }

    private void verifyResultsStepFloat2FloatFloat2(Allocation inEdge, Allocation inV, Allocation out, boolean relaxed) {
        float[] arrayInEdge = new float[INPUTSIZE * 2];
        inEdge.copyTo(arrayInEdge);
        float[] arrayInV = new float[INPUTSIZE * 1];
        inV.copyTo(arrayInV);
        float[] arrayOut = new float[INPUTSIZE * 2];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inEdge = arrayInEdge[i * 2 + j];
                args.inV = arrayInV[i];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeStep(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inEdge: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inEdge, Float.floatToRawIntBits(args.inEdge), args.inEdge));
                    message.append("\n");
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 2 + j], Float.floatToRawIntBits(arrayOut[i * 2 + j]), arrayOut[i * 2 + j]));
                    if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkStepFloat2FloatFloat2" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkStepFloat3FloatFloat3() {
        Allocation inEdge = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x304ed837c68f43fal, false);
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x4fcd1a0aa53f7e7dl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.set_gAllocInV(inV);
            script.forEach_testStepFloat3FloatFloat3(inEdge, out);
            verifyResultsStepFloat3FloatFloat3(inEdge, inV, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat3FloatFloat3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.set_gAllocInV(inV);
            scriptRelaxed.forEach_testStepFloat3FloatFloat3(inEdge, out);
            verifyResultsStepFloat3FloatFloat3(inEdge, inV, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat3FloatFloat3: " + e.toString());
        }
    }

    private void verifyResultsStepFloat3FloatFloat3(Allocation inEdge, Allocation inV, Allocation out, boolean relaxed) {
        float[] arrayInEdge = new float[INPUTSIZE * 4];
        inEdge.copyTo(arrayInEdge);
        float[] arrayInV = new float[INPUTSIZE * 1];
        inV.copyTo(arrayInV);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inEdge = arrayInEdge[i * 4 + j];
                args.inV = arrayInV[i];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeStep(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inEdge: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inEdge, Float.floatToRawIntBits(args.inEdge), args.inEdge));
                    message.append("\n");
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkStepFloat3FloatFloat3" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkStepFloat4FloatFloat4() {
        Allocation inEdge = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0xaff1a9ab31e0fccel, false);
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xa51ccd2293aa72d9l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.set_gAllocInV(inV);
            script.forEach_testStepFloat4FloatFloat4(inEdge, out);
            verifyResultsStepFloat4FloatFloat4(inEdge, inV, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat4FloatFloat4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.set_gAllocInV(inV);
            scriptRelaxed.forEach_testStepFloat4FloatFloat4(inEdge, out);
            verifyResultsStepFloat4FloatFloat4(inEdge, inV, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testStepFloat4FloatFloat4: " + e.toString());
        }
    }

    private void verifyResultsStepFloat4FloatFloat4(Allocation inEdge, Allocation inV, Allocation out, boolean relaxed) {
        float[] arrayInEdge = new float[INPUTSIZE * 4];
        inEdge.copyTo(arrayInEdge);
        float[] arrayInV = new float[INPUTSIZE * 1];
        inV.copyTo(arrayInV);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inEdge = arrayInEdge[i * 4 + j];
                args.inV = arrayInV[i];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeStep(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inEdge: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inEdge, Float.floatToRawIntBits(args.inEdge), args.inEdge));
                    message.append("\n");
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkStepFloat4FloatFloat4" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    public void testStep() {
        checkStepFloatFloatFloat();
        checkStepFloat2Float2Float2();
        checkStepFloat3Float3Float3();
        checkStepFloat4Float4Float4();
        checkStepFloat2FloatFloat2();
        checkStepFloat3FloatFloat3();
        checkStepFloat4FloatFloat4();
    }
}