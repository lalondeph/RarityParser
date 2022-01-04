package rarity_parser.rarity_parser.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="PERCENTAGE_DATA")
public class Percentage_Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PERCENTAGE_ID")
    private Long attributeId;

    @Column(name="NFT_ID")
    private Long nftId;
    
    @Column(name="PERCENTAGE_BACKGROUND")
    private Integer percentBackground;

    @Column(name="PERCENTAGE_CART_COLOR")
    private String percentColor;

    @Column(name="PERCENTAGE_CART_ART")
    private Integer percentArt;

    @Column(name="PERCENTAGE_PRICE_STICKER")
    private Integer percentPriceSticker;

    @Column(name="PERCENTAGE_CART_CONDITION")
    private Integer percentPartCondition;

    @OneToOne(mappedBy = "percentage")
    private NFT_Data data;

}