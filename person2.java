package sample;

public class person2 {

    String Customername,Phone,Date,From,To,Seat,Price;
    public person2(String Customername,String Phone,String Date,String From,String To,String Seat,String Price) {
        this.Customername = Customername;
        this.Phone = Phone;
        this.Date = Date;
        this.From = From;
        this.To = To;
        this.Seat = Seat;
        this.Price = Price;
    }

    public String getCustomername() {
        return Customername;
    }

    public void setCustomername(String customername) {
        Customername = customername;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String seat) {
        Seat = seat;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

}
