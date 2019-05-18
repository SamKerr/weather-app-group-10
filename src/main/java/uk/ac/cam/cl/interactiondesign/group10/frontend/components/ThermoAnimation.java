package uk.ac.cam.cl.interactiondesign.group10.frontend.components;

import java.io.File;

/**
 * ThermoAnimation = Thermometer Animation
 * Instance of WAnimation
 * Provides all images to be in animation as well as frame limit calculation
 */
public class ThermoAnimation extends WAnimation {

    private static String[] thermoPaths = {
            "images/Animations/thermometer/1.png",
            "images/Animations/thermometer/2.png",
            "images/Animations/thermometer/3.png",
            "images/Animations/thermometer/4.png",
            "images/Animations/thermometer/5.png",
            "images/Animations/thermometer/6.png",
            "images/Animations/thermometer/7.png",
            "images/Animations/thermometer/8.png",
            "images/Animations/thermometer/9.png",
            "images/Animations/thermometer/10.png",
            "images/Animations/thermometer/11.png",
            "images/Animations/thermometer/12.png",
            "images/Animations/thermometer/13.png",
            "images/Animations/thermometer/14.png",
            "images/Animations/thermometer/15.png",
            "images/Animations/thermometer/16.png",
            "images/Animations/thermometer/17.png",
            "images/Animations/thermometer/18.png",
            "images/Animations/thermometer/19.png",
            "images/Animations/thermometer/20.png",
            "images/Animations/thermometer/21.png",
            "images/Animations/thermometer/22.png",
            "images/Animations/thermometer/23.png",
    };

    public ThermoAnimation(double value, int fitWidth) {
        super(thermoPaths, value, fitWidth);
    }


    @Override
    int getFrameLimit(double value) {
        // 6 notches high at 0 celcius
        int calculation = (int) (2*(value+30)/10);
        return Math.min(calculation, thermoPaths.length-1);
    }
}
