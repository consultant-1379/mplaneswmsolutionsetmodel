/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2024
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson AB. The programs may be used and/or copied only with written
 * permission from Ericsson AB. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.mediation.mplane.configuration;

import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinition;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinitions;
import com.ericsson.oss.itpf.modeling.annotation.configparam.Scope;


@EModel(namespace = "ORUSoftwarePackageVersionParameter", description = "Configuration parameters for SHM")
@ConfParamDefinitions
public class ORUSoftwarePackageVersionParameter {

    @ConfParamDefinition(description = "Details the intended software package versions to be installed on the O-RU during the start-up procedure.", scope = Scope.SERVICE)
    @DefaultValue("")
    public String O_RU_Software_Packages;
}
