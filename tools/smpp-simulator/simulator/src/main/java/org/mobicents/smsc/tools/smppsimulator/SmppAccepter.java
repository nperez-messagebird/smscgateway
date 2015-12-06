/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2015, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package org.mobicents.smsc.tools.smppsimulator;

import com.cloudhopper.smpp.pdu.BaseSm;

/**
 * 
 * @author sergey vetyutnev
 * 
 */
public interface SmppAccepter {

    /**
     * Invokes on a new SMPP request parsed from PDU
     *
     * @param pdu
     */
    void onNewSmppRequest(BaseSm pdu) throws Exception; 

    /**
     * @return
     *   true:  parse till next SMPP request
     *   false: stop parsing
     */
    boolean needContinue(); 

}