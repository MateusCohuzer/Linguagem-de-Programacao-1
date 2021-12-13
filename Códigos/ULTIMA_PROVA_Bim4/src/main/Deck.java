package main;

import java.util.Date;

/**
 *
 * @author Mateus CohuzEr
 */
public class Deck {

    private String card_name;
    private int card_id;
    private String card_main_type;
    private String card_sub_type;
    private int level_rank_link;
    private int atk;
    private int def;
    private String effect;
    private String type;
    private String attribute;
    private int[] pendulum_scale;
    private String pendulum_effect;
    private Date r_date;
    private String colecao;
    private double price;

    public Deck(String card_name, int card_id, String card_main_type, String card_sub_type, int level_rank_link, int atk, int def, String effect, String type, String attribute, int[] pendulum_scale, String pendulum_effect, Date r_date, String colecao, double price) {
        this.card_name = card_name;
        this.card_id = card_id;
        this.card_main_type = card_main_type;
        this.card_sub_type = card_sub_type;
        this.level_rank_link = level_rank_link;
        this.atk = atk;
        this.def = def;
        this.effect = effect;
        this.type = type;
        this.attribute = attribute;
        this.pendulum_scale = pendulum_scale;
        this.pendulum_effect = pendulum_effect;
        this.r_date = r_date;
        this.colecao = colecao;
        this.price = price;
    }

    Deck() {
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public String getCard_main_type() {
        return card_main_type;
    }

    public void setCard_main_type(String card_main_type) {
        this.card_main_type = card_main_type;
    }

    public String getCard_sub_type() {
        return card_sub_type;
    }

    public void setCard_sub_type(String card_sub_type) {
        this.card_sub_type = card_sub_type;
    }

    public int getLevel_rank_link() {
        return level_rank_link;
    }

    public void setLevel_rank_link(int level_rank_link) {
        this.level_rank_link = level_rank_link;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int[] getPendulum_scale() {
        return pendulum_scale;
    }

    public void setPendulum_scale(int[] pendulum_scale) {
        this.pendulum_scale = pendulum_scale;
    }

    public String getPendulum_effect() {
        return pendulum_effect;
    }

    public void setPendulum_effect(String pendulum_effect) {
        this.pendulum_effect = pendulum_effect;
    }

    public Date getR_date() {
        return r_date;
    }

    public void setR_date(Date r_date) {
        this.r_date = r_date;
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        if (card_sub_type.equals("Pêndulo")) {
            return card_name + ";" + card_id + ";" + card_main_type + ";" + card_sub_type + ";" + level_rank_link + ";" + atk + ";" + def + ";" + effect + ";" + type + ";" + attribute + ";" + pendulum_scale[0] + ";" + pendulum_scale[1] + ";" + pendulum_effect + ";" + r_date + ";" + colecao + ";" + price;
        } else if (card_sub_type.equals("Link")) {
            return card_name + ";" + card_id + ";" + card_main_type + ";" + card_sub_type + ";" + level_rank_link + ";" + atk + ";" + effect + ";" + type + ";" + attribute + ";" + r_date + ";" + colecao + ";" + price;
        } else if (card_main_type.equals("Monstro")) {
            return card_name + ";" + card_id + ";" + card_main_type + ";" + card_sub_type + ";" + level_rank_link + ";" + atk + ";" + def + ";" + effect + ";" + type + ";" + attribute + ";" + r_date + ";" + colecao + ";" + price;
        } else if (card_main_type.equals("Magia")) {
            return card_name + ";" + card_id + ";" + card_main_type + ";" + card_sub_type + ";" + effect + ";" + r_date + ";" + colecao + ";" + price;
        } else if (card_main_type.equals("Armadilha")) {
            return card_name + ";" + card_id + ";" + card_main_type + ";" + card_sub_type + ";" + effect + ";" + r_date + ";" + colecao + ";" + price;
        }
        return "0";
    }
}
