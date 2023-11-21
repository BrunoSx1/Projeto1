package br.com.bs.domain;

import java.util.Objects;

public class Client {
    private String name;
    private Long cpf;
    private Long tel;
    private String adsress;
    private Integer number;
    private String city;
    private String state;

    public Client(String name, String cpf, String tel, String adsress, String number, String city, String state) {
        this.name = name;
        this.cpf = Long.valueOf(cpf.trim());
        this.tel = Long.valueOf(tel.trim());
        this.adsress = adsress;
        this.number = Integer.valueOf(number.trim());
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getAdsress() {
        return adsress;
    }

    public void setAdsress(String adsress) {
        this.adsress = adsress;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(cpf, client.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "br.com.bs.domain.Client{" +
                "name='" + name + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
