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
@Table(name="NFT_DATA")
public class NFT_Attributes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ATTRIBUTE_ID")
    private Long attributeId;

    @Column(name="NFT_ID")
    private Long nftId;
    
    @Column(name="BACKGROUND")
    private Integer background;

    @Column(name="CART_COLOR")
    private String color;

    @Column(name="CART_ART")
    private Integer art;

    @Column(name="PRICE_STICKER")
    private Integer priceSticker;

    @Column(name="CART_CONDITION")
    private Integer cartCondition;

    @OneToOne(mappedBy = "attributes")
    private NFT_Data data;

}