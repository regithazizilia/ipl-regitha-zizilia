class StudentCinema extends Cinema {
    public StudentCinema(double price) {
        this.price = price;
    }
    @Override
    Double calculateAdminFee() {
        return price * 2 / 100;
    }
}