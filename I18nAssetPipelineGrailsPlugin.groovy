/*
 * I18nAssetPipelineGrailsPlugin.groovy
 *
 * Copyright (c) 2014, Daniel Ellermann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import asset.pipeline.AssetHelper
import asset.pipeline.i18n.I18nAssetFile


class I18nAssetPipelineGrailsPlugin {
    def version = '0.9.0'
    def grailsVersion = '2.2 > *'
    def title = 'I18n Asset Pipeline Plugin'
    def author = 'Daniel Ellermann'
    def authorEmail = 'd.ellermann@amc-world.de'
    def description = 'An asset-pipeline plugin for client-side i18n.  It generates JavaScript files from i18n resources for use in client-side code.'
    def documentation = 'http://grails.org/plugin/i18n-asset-pipeline'
    def license = 'APACHE'
    def organization = [
        name: 'AMC World Technologies GmbH',
        url: 'http://www.amc-world.de/'
    ]
    def issueManagement = [
        system: 'GITHUB',
        url: 'https://github.com/dellermann/i18n-asset-pipeline/issues'
    ]
    def scm = [url: 'https://github.com/dellermann/i18n-asset-pipeline']
    def pluginExcludes = [
        'grails-app/views/error.gsp'
    ]

    def doWithDynamicMethods = { ctx ->
        AssetHelper.assetSpecs << I18nAssetFile
    }
}
