/*-
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2017 wcm.io DevOps
 * %%
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
 * #L%
 */

import io.wcm.devops.jenkins.pipeline.environment.EnvironmentConstants
import io.wcm.devops.jenkins.pipeline.utils.logging.Logger

import static io.wcm.devops.jenkins.pipeline.utils.ConfigConstants.ANSI_COLOR
import static io.wcm.devops.jenkins.pipeline.utils.ConfigConstants.ANSI_COLOR_XTERM

/**
 * Enables color output in Jenkins console by using the ansiColor step
 * Please refer to the documentation for details about the configuration options
 *
 * @param config The configuration options
 * @param body The closure to be executed
 *
 * @deprecated
 */
void color(Map config = [:], Closure body) {
    Logger log = new Logger(this)
    log.deprecated("wrap.color", "wrappers.color")

    wrappers.color(config) {
        body()
    }
}
