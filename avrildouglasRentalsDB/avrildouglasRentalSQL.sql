create database avrildouglasRentals;
create user 'rentuser'@'localhost' identified by 'TheTenant';
grant all on avrildouglasRentals.* to 'rentuser'@'localhost';

