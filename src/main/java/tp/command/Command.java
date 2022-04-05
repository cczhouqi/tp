package tp.command;

import tp.AppointmentList;
import tp.DoctorList;
import tp.PatientList;
import tp.Ui;
import tp.person.Doctor;
import tp.DoctorStorage;
import tp.PatientStorage;
import tp.IHospitalException;
import tp.AppointmentStorage;

public abstract class Command {
    public static String boundary = "____________________________________________________________\n";

    public boolean isExit() {
        return false;
    }

    public abstract String execute(DoctorList doctorList, PatientList patientList,
                                   AppointmentList appointmentList, Ui ui, DoctorStorage doctorStorage,
                                   PatientStorage patientStorage,
                                   AppointmentStorage appointmentStorage) throws IHospitalException;
}