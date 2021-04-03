package ro.ase.cts.clase.clase.readers;

import ro.ase.cts.clase.clase.Aplicant;
import ro.ase.cts.clase.clase.Student;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends Readable {

    public StudentiReader(String fileName) {
        super(fileName);
    }




    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(fileName);
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student stundet=new Student();
            super.readAplicant(input,stundet);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            stundet.setFacultate(facultate);
            stundet.setAn_studii(an_studii);

            studenti.add(stundet);
        }
        input.close();
        return studenti;
    }
}
