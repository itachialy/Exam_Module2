package Repository;

import HoSoBenhAn.BenhNhanThuong;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegularRepoImpl implements IRegularRepo {
    public static String PATH = "src/data/medical_records.csv";

    @Override
    public List<BenhNhanThuong> findAll() {
        List<BenhNhanThuong> list = new ArrayList<>();
        try(
                FileReader fileReader = new FileReader(PATH);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ){
            String temp;
            String[] arrData;
            while ((temp = bufferedReader.readLine()) != null) {
                arrData = temp.split(",");
                list.add(new BenhNhanThuong(Integer.parseInt(arrData[0]),
                        arrData[1],
                        arrData[2],
                        LocalDate.parse(arrData[3]),
                        LocalDate.parse(arrData[4]),
                        arrData[5],
                        Integer.parseInt(arrData[6])));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return list;
    }

    @Override
    public void save(BenhNhanThuong benhNhanThuong) {
            try(
                    FileWriter fileWriter = new FileWriter(PATH, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
            ) {
                bufferedWriter.write(benhNhanThuong.convertToLine());
                bufferedWriter.newLine();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    @Override
    public void delete(int STT) {
        List<BenhNhanThuong> list = findAll();
        for (int i = 0 ; i < list.size() ; i++) {
            if (list.get(i).getSTT() == STT) {
                list.remove(i);
                break;
            }
        }
        saveListToFile(list);
    }

    @Override
    public BenhNhanThuong findById(int id) {
        List<BenhNhanThuong>list = findAll();
        for (BenhNhanThuong s : list){
            if (s.getSTT() == id){
                System.out.println(s);
                return s;
            }
        }
        return null;
    }

    public void saveListToFile(List<BenhNhanThuong> list) {
        try(
                FileWriter fileWriter = new FileWriter(PATH);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for (BenhNhanThuong s : list) {
                bufferedWriter.write(s.convertToLine());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}





