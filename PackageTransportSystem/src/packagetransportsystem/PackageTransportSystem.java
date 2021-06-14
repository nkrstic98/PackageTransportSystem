/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagetransportsystem;

import packagetransportsystem.student.*;
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
        CityOperations cityOperations = new kn170265_CityOperations();
        DistrictOperations districtOperations = new kn170265_DistrictOperations();
        CourierOperations courierOperations = new kn170265_CourierOperations();
        CourierRequestOperation courierRequestOperation = new kn170265_CourierRequestOperation();
        GeneralOperations generalOperations = new kn170265_GeneralOperations();
        UserOperations userOperations = new kn170265_UserOperations();
        VehicleOperations vehicleOperations = new kn170265_VehicleOperations();
        PackageOperations packageOperations = new kn170265_PackageOperations();

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
