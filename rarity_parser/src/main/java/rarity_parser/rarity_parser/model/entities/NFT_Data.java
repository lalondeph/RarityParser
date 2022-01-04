package rarity_parser.rarity_parser.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="NFT_DATA")
public class NFT_Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="NFT_ID")
    private Long nftId;

    @Column(name="NFT_DESCRIPTION")
    private String nftDescription;
    
    @Column(name="NFT_IMAGE")
    private Integer nftImage;

    @Column(name="NFT_DNA")
    private String nftDna;

    @Column(name="NFT_EDITION")
    private Integer nftEdition;

    @Column(name="NFT_DATE")
    private Integer nftDate;

    /* RELATIONSHIPS */

    @OneToOne
    @JoinColumn(name = "ATTRIBUTE_ID")
    private NFT_Attributes attributes;

    @OneToOne
    @JoinColumn(name = "TOTAL_ID")
    private NFT_Totals totals;

    @OneToOne
    @JoinColumn(name = "PERCENTAGE_ID")
    private Percentage_Data percentage;

    /* CONSTRUCTOR */
    
    public NFT_Data() {
        nftDescription = null;
        nftImage = null;
        nftDna = null;
        nftEdition = null;
        nftDate = null;
    }
}