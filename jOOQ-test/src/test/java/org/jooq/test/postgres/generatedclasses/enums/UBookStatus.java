/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum UBookStatus implements org.jooq.EnumType {

	SOLD_OUT("SOLD OUT"),

	ON_STOCK("ON STOCK"),

	ORDERED("ORDERED");

	private final java.lang.String literal;

	private UBookStatus(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return org.jooq.test.postgres.generatedclasses.Public.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "u_book_status";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}