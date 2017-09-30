/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.Total;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TotalRecord extends TableRecordImpl<TotalRecord> implements Record4<Integer, String, String, BigDecimal> {

	private static final long serialVersionUID = 878010699;

	/**
	 * Setter for <code>public.total.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.total.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.total.tag</code>.
	 */
	public void setTag(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.total.tag</code>.
	 */
	public String getTag() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.total.merchant</code>.
	 */
	public void setMerchant(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.total.merchant</code>.
	 */
	public String getMerchant() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.total.amount</code>.
	 */
	public void setAmount(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.total.amount</code>.
	 */
	public BigDecimal getAmount() {
		return (BigDecimal) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, String, String, BigDecimal> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, String, String, BigDecimal> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Total.TOTAL.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Total.TOTAL.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Total.TOTAL.MERCHANT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return Total.TOTAL.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getMerchant();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TotalRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TotalRecord value2(String value) {
		setTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TotalRecord value3(String value) {
		setMerchant(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TotalRecord value4(BigDecimal value) {
		setAmount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TotalRecord values(Integer value1, String value2, String value3, BigDecimal value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TotalRecord
	 */
	public TotalRecord() {
		super(Total.TOTAL);
	}

	/**
	 * Create a detached, initialised TotalRecord
	 */
	public TotalRecord(Integer id, String tag, String merchant, BigDecimal amount) {
		super(Total.TOTAL);

		setValue(0, id);
		setValue(1, tag);
		setValue(2, merchant);
		setValue(3, amount);
	}
}