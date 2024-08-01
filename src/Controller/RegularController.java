package Controller;

import HoSoBenhAn.BenhNhanThuong;
import Service.IRegularService;
import Service.RegularServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularController {
    private final IRegularService iRegularService = new RegularServiceImpl();
    private final Scanner sc = new Scanner(System.in);

    public void displayAll() {
        List<BenhNhanThuong> list = iRegularService.findAll();
        if (list.isEmpty()) {
            System.out.println("Khong tim thay ho so benh án.");
        } else {
            System.out.println("Danh sach hồ sơ bệnh án là: ");
            for (BenhNhanThuong s : list) {
                System.out.println(s);
            }
        }
    }

    public boolean isExist(int STT) {
        BenhNhanThuong benhNhanThuong = iRegularService.findById(STT);
        return benhNhanThuong != null;
    }

    public void addRegular() {
        System.out.println("Nhập STT của bệnh án :");
        int STT = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mã bệnh án :");
        String code = sc.nextLine();
        System.out.println("Nhập tên bệnh nhân :");
        String name = sc.nextLine();
        String temp;
        System.out.println("Ngày nhập viện :");
        temp = sc.nextLine();
        LocalDate inDay = LocalDate.parse(temp);
        String temp1;
        System.out.println("Ngày xuất viện :");
        temp1 = sc.nextLine();
        LocalDate outDay = LocalDate.parse(temp1);
        System.out.println("Lý do nhập viện :");
        String reason = sc.nextLine();
        System.out.println("Nhập phí nằm viện :");
        int phiNamVien = Integer.parseInt(sc.nextLine());
        BenhNhanThuong benhNhanThuong = new BenhNhanThuong(STT, code, name, inDay, outDay, reason, phiNamVien);
        iRegularService.save(benhNhanThuong);
        System.out.println("Thêm mới bệnh nhân thành công.");
    }

    public void deleteRegular() {
        System.out.println("Nhập STT cần xóa : ");
        int STT = Integer.parseInt(sc.nextLine());
        if (isExist(STT)) {
            iRegularService.delete(STT);
            System.out.println("Xóa bệnh nhân với STT " + STT + " thành công.");
        } else {
            System.out.println("Không tồn STT " + STT);
        }
    }

    private static final Pattern MA_BENH_AN_PATTERN = Pattern.compile("BA-\\d{3}");
    private static final Pattern MA_BENH_NHAN_PATTERN = Pattern.compile("BN-\\d{3}");

}
