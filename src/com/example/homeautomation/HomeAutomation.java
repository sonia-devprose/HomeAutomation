package com.example.homeautomation;

public class HomeAutomation {

    public static void main (String [] args)
    {

        // Device control using bitwise operations
        int deviceFlag = 0b0000;
        boolean isDeviceOff;
        if (isDeviceOff = (deviceFlag == 0b0000))
        {
            System.out.println("All devices are off");
        }
        else
        {
            System.out.println("Light device is not active");
        }
         deviceFlag = 0b0001;
        boolean isLightDevice;
        if (isLightDevice = (deviceFlag & 0b0001) != 0)
        {
            System.out.println("Light device is active");
        }
            else
        {
            System.out.println("Light device is not active");
        }

            deviceFlag = 0b0010;
        boolean isFanDevice;
        if (isFanDevice = (deviceFlag & 0b0010) != 0)
        {
            System.out.println("Fan is active");
        }
        else
        {
            System.out.println("Fan is not active");
        }

        deviceFlag = 0b0100;
        boolean isAcDevice;
        if (isAcDevice = (deviceFlag & 0b0100) != 0)
        {
            System.out.println("AC is active");
        }
        else
        {
            System.out.println("AC is not active");
        }

        deviceFlag = 0b1000;
        boolean isheaterDevice;
        if (isheaterDevice = (deviceFlag & 0b1000) != 0)
        {
            System.out.println("Heater is active");
        }
        else
        {
            System.out.println("Heater is not active");
        }

        // Energy management using arithmetic operators
        int lightPower = 60;
        int fanPower = 75;
        int acPower = 2000;
        int heaterPower = 1500;

        int totalPower;

        totalPower = lightPower + fanPower + acPower + heaterPower;
        System.out.println("Power consumed when light is on: " + lightPower + "W");
        System.out.println("Power consumed when fan is on: " + fanPower + "W");
        System.out.println("Power consumed when AC is on: " + acPower + "W");
        System.out.println("Power consumed when heater is on: " + heaterPower + "W");
        System.out.println("Total power consumed: " + totalPower + "W");

        // Temperature control using relational and logical operators

        int roomTemp = 27;

        if (roomTemp > 20 && roomTemp < 25)
        {
            System.out.println ("Devices are off");
        }
        else if (roomTemp > 25)
        {
            System.out.println ("AC is on");
        }
        else
        {

            System.out.println ("Heater is on");
        }
        // Mode management using ternary operator
 String mode = (totalPower < 2000) ? "Normal mode" : "Energy-saving mode";
        System.out.println("System operates in: " + mode);

        // Device scheduling using modulus operator
        int timeinMinutes = 45;
        if (timeinMinutes % 15==0)
        {
            System.out.println("Device is turned off.");
        }
        // Safety check using logical operators

        if (totalPower > 3000)
        {
            System.out.println("All devices are turned off.");
        }

        // Reporting and monitoring
    }
}
