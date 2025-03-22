package com.debugueandoideas.services;


import com.debugueandoideas.model.RealityStone;
import com.debugueandoideas.model.Stone;
import lombok.extern.java.Log;

//@service
@Log
public class GuantleServiceImplmpl implements GuantleService {

    public Stone reality = new RealityStone();
    @Override
    public void useGuantle(String stoneName) {
        log.info("use stone "+ reality);
    }
}
