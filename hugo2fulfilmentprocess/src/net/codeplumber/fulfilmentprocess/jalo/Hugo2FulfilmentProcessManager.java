/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package net.codeplumber.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import net.codeplumber.fulfilmentprocess.constants.Hugo2FulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class Hugo2FulfilmentProcessManager extends GeneratedHugo2FulfilmentProcessManager
{
	public static final Hugo2FulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Hugo2FulfilmentProcessManager) em.getExtension(Hugo2FulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
