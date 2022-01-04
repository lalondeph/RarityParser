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
@Table(name="NFT_TOTALS")
public class NFT_Totals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TOTAL_ID")
    private Long totalId;

    @Column(name="NFT_ID")
    private Long nftId;
    
    @Column(name="TOTAL_BACKGROUND")
    private Integer totalBackground;

    @Column(name="TOTAL_CART_COLOR")
    private String totalColor;

    @Column(name="TOTAL_CART_ART")
    private Integer totalArt;

    @Column(name="TOTAL_PRICE_STICKER")
    private Integer totalPriceSticker;

    @Column(name="TOTAL_CART_CONDITION")
    private Integer totalCartCondition;

    @OneToOne(mappedBy = "totals")
    private NFT_Data data;

}