package HELLOJAR;

import view.InvoiceView;
import vn.edu.ptit.Invoice;

public class Main
{
    public static void main(String[] args)
    {
        PaymentController pc = new PaymentController();
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
/*
B20DCCN001
Nguyễn Văn A
2
INT1155
Tin học cơ sở 2
2
INT1332
Lập trình hướng đối tượng
3
QD123
QD123 HP
550000
*/