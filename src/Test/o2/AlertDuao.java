package Test.o2;

import java.util.Date;


import java.util.UUID;

   interface AlertService {
         MapAlertDAO storage = new MapAlertDAO();

        public UUID raiseAlert() ;
        public Date getAlertTime();
    }

