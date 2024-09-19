package com.library.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtil {

   public Logger LOG = LogManager.getLogger(LogUtil.class);

    public void logInfo(String message) {

            LOG.info(message);

        }
    public void logError(String message) {

        LOG.info(message);

    }
    }

