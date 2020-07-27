/*-
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2017 - 2020 wcm.io DevOps
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
package vars.im.mattermost.jobs
/**
 * Runs notify.mattermost step with default configuration
 *
 * @return The script
 */
def execute() {
  im.mattermost("customEndpointMessage", "customEndpointText", "customEndpointColor", "customEndpointChannel", "customEndpointIcon", "https://customEndpoint", true)
}


return this