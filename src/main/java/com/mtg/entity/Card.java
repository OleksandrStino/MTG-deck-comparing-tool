package com.mtg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card {

	@Id
	private long multiverseid;

	@Column
	private String name;

	@Column(name = "image")
	private String imageUrl;

	@Column
	private String type;

	@Column
	private String rarity;

	@Column(name = "set")	private String setName;

	@Column
	private String text;

	public Card() {
	}

	public long getMultiverseid() {
		return multiverseid;
	}

	public void setMultiverseid(long multiverseid) {
		this.multiverseid = multiverseid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public String getSetName() {
		return setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Card{" +
				"multiverseid=" + multiverseid +
				", name='" + name + '\'' +
				", imageUrl='" + imageUrl + '\'' +
				", type='" + type + '\'' +
				", rarity='" + rarity + '\'' +
				", setName='" + setName + '\'' +
				", text='" + text + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Card card = (Card) o;

		if (multiverseid != card.multiverseid) return false;
		return name.equals(card.name);
	}

	@Override
	public int hashCode() {
		int result = (int) (multiverseid ^ (multiverseid >>> 32));
		result = 31 * result + name.hashCode();
		return result;
	}
}
