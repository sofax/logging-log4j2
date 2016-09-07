/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Copyright (C) 2000-2016
//    by aixigo AG, Aachen, Germany.
//
//  All rights reserved. This material is confidential and proprietary to AIXIGO AG and no part of this
//  material should be reproduced, published in any form by any means, electronic or mechanical including
//  photocopy or any information storage or retrieval system nor should the material be disclosed to third
//  parties without the express written authorization of AIXIGO AG.
//
//  aixigo AG
//  http://www.aixigo.de
//  Aachen, Germany
//

package org.apache.logging.log4j.core.config;

@SuppressWarnings( "javadoc" )
public interface ShutdownListener
{
    void shuttingDown();
}
