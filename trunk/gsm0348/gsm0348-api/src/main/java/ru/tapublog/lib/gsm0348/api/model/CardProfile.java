//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 04:14:20 PM MSD 
//


package ru.tapublog.lib.gsm0348.api.model;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CardProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="KIC" type="{ru.tapublog.lib.gsm0348}KIC"/>
 *         &lt;element name="KID" type="{ru.tapublog.lib.gsm0348}KID"/>
 *         &lt;element name="SPI" type="{ru.tapublog.lib.gsm0348}SPI"/>
 *         &lt;element name="TAR" type="{ru.tapublog.lib.gsm0348}TAR"/>
 *         &lt;element name="SecurityBytesType" type="{ru.tapublog.lib.gsm0348}SecurityBytesType"/>
 *         &lt;element name="SignatureAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CipheringAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardProfile", propOrder = {

})
public class CardProfile {

    @XmlElement(name = "KIC", required = true)
    protected KIC kic;
    @XmlElement(name = "KID", required = true)
    protected KID kid;
    @XmlElement(name = "SPI", required = true)
    protected SPI spi;
    @XmlElement(name = "TAR", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] tar;
    @XmlElement(name = "SecurityBytesType", required = true)
    protected SecurityBytesType securityBytesType;
    @XmlElement(name = "SignatureAlgorithm", required = true)
    protected String signatureAlgorithm;
    @XmlElement(name = "CipheringAlgorithm", required = true)
    protected String cipheringAlgorithm;

    /**
     * Gets the value of the kic property.
     * 
     * @return
     *     possible object is
     *     {@link KIC }
     *     
     */
    public KIC getKIC() {
        return kic;
    }

    /**
     * Sets the value of the kic property.
     * 
     * @param value
     *     allowed object is
     *     {@link KIC }
     *     
     */
    public void setKIC(KIC value) {
        this.kic = value;
    }

    /**
     * Gets the value of the kid property.
     * 
     * @return
     *     possible object is
     *     {@link KID }
     *     
     */
    public KID getKID() {
        return kid;
    }

    /**
     * Sets the value of the kid property.
     * 
     * @param value
     *     allowed object is
     *     {@link KID }
     *     
     */
    public void setKID(KID value) {
        this.kid = value;
    }

    /**
     * Gets the value of the spi property.
     * 
     * @return
     *     possible object is
     *     {@link SPI }
     *     
     */
    public SPI getSPI() {
        return spi;
    }

    /**
     * Sets the value of the spi property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPI }
     *     
     */
    public void setSPI(SPI value) {
        this.spi = value;
    }

    /**
     * Gets the value of the tar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getTAR() {
        return tar;
    }

    /**
     * Sets the value of the tar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAR(byte[] value) {
        this.tar = ((byte[]) value);
    }

    /**
     * Gets the value of the securityBytesType property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityBytesType }
     *     
     */
    public SecurityBytesType getSecurityBytesType() {
        return securityBytesType;
    }

    /**
     * Sets the value of the securityBytesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityBytesType }
     *     
     */
    public void setSecurityBytesType(SecurityBytesType value) {
        this.securityBytesType = value;
    }

    /**
     * Gets the value of the signatureAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Sets the value of the signatureAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureAlgorithm(String value) {
        this.signatureAlgorithm = value;
    }

    /**
     * Gets the value of the cipheringAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCipheringAlgorithm() {
        return cipheringAlgorithm;
    }

    /**
     * Sets the value of the cipheringAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCipheringAlgorithm(String value) {
        this.cipheringAlgorithm = value;
    }

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cipheringAlgorithm == null) ? 0 : cipheringAlgorithm.hashCode());
		result = prime * result + ((kic == null) ? 0 : kic.hashCode());
		result = prime * result + ((kid == null) ? 0 : kid.hashCode());
		result = prime * result + ((securityBytesType == null) ? 0 : securityBytesType.hashCode());
		result = prime * result + ((signatureAlgorithm == null) ? 0 : signatureAlgorithm.hashCode());
		result = prime * result + ((spi == null) ? 0 : spi.hashCode());
		result = prime * result + Arrays.hashCode(tar);
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CardProfile))
			return false;
		CardProfile other = (CardProfile) obj;
		if (cipheringAlgorithm == null)
		{
			if (other.cipheringAlgorithm != null)
				return false;
		}
		else if (!cipheringAlgorithm.equals(other.cipheringAlgorithm))
			return false;
		if (kic == null)
		{
			if (other.kic != null)
				return false;
		}
		else if (!kic.equals(other.kic))
			return false;
		if (kid == null)
		{
			if (other.kid != null)
				return false;
		}
		else if (!kid.equals(other.kid))
			return false;
		if (securityBytesType != other.securityBytesType)
			return false;
		if (signatureAlgorithm == null)
		{
			if (other.signatureAlgorithm != null)
				return false;
		}
		else if (!signatureAlgorithm.equals(other.signatureAlgorithm))
			return false;
		if (spi == null)
		{
			if (other.spi != null)
				return false;
		}
		else if (!spi.equals(other.spi))
			return false;
		if (!Arrays.equals(tar, other.tar))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("CardProfile [kic=");
		builder.append(kic);
		builder.append(", kid=");
		builder.append(kid);
		builder.append(", spi=");
		builder.append(spi);
		builder.append(", tar=");
		builder.append(Arrays.toString(tar));
		builder.append(", securityBytesType=");
		builder.append(securityBytesType);
		builder.append(", signatureAlgorithm=");
		builder.append(signatureAlgorithm);
		builder.append(", cipheringAlgorithm=");
		builder.append(cipheringAlgorithm);
		builder.append("]");
		return builder.toString();
	}

}