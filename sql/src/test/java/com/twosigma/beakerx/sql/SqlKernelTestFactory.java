/*
 *  Copyright 2018 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.twosigma.beakerx.sql;

import com.twosigma.beakerx.KernelTest;
import com.twosigma.beakerx.evaluator.BaseEvaluator;
import com.twosigma.beakerx.kernel.msg.MessageCreator;

public class SqlKernelTestFactory {
  public static KernelTest getKernel() {
    return new KernelTest(MessageCreator.get(), new MagicCommandConfigurationMock());
  }

  public static KernelTest getKernel(BaseEvaluator evaluator) {
    return new KernelTest("id1", evaluator, MessageCreator.get(), new MagicCommandConfigurationMock());
  }
}
