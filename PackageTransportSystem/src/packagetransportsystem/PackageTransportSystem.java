/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagetransportsystem;

import rs.etf.sab.operations.*;
import rs.etf.sab.tests.TestHandler;
import rs.etf.sab.tests.TestRunner;

/**
 *
 * @author Nikola Krstic
 */
public class PackageTransportSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CityOperations cityOperations = null; // Change this to your implementation.
        DistrictOperations districtOperations = null; // Do it for all classes.
        CourierOperations courierOperations = null; // e.g. = new MyDistrictOperations();
        CourierRequestOperation courierRequestOperation = null;
        GeneralOperations generalOperations = null;
        UserOperations userOperations = null;
        VehicleOperations vehicleOperations = null;
        PackageOperations packageOperations = null;

        TestHandler.createInstance(
                cityOperations,
                courierOperations,
                courierRequestOperation,
                districtOperations,
                generalOperations,
                userOperations,
                vehicleOperations,
                packageOperations);

        TestRunner.runTests();
    }
    
}
