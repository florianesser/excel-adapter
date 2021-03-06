/**
 */
package net.opengis.gml32;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nil Reason Enumeration Member0</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.opengis.gml32.GMLPackage#getNilReasonEnumerationMember0()
 * @model extendedMetaData="name='NilReasonEnumeration_._member_._0'"
 * @generated
 */
public enum NilReasonEnumerationMember0 implements Enumerator
{
	/**
	 * The '<em><b>Inapplicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INAPPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	INAPPLICABLE(0, "inapplicable", "inapplicable"),

	/**
	 * The '<em><b>Missing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSING_VALUE
	 * @generated
	 * @ordered
	 */
	MISSING(1, "missing", "missing"),

	/**
	 * The '<em><b>Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPLATE(2, "template", "template"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(3, "unknown", "unknown"),

	/**
	 * The '<em><b>Withheld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHHELD_VALUE
	 * @generated
	 * @ordered
	 */
	WITHHELD(4, "withheld", "withheld");

	/**
	 * The '<em><b>Inapplicable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inapplicable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INAPPLICABLE
	 * @model name="inapplicable"
	 * @generated
	 * @ordered
	 */
	public static final int INAPPLICABLE_VALUE = 0;

	/**
	 * The '<em><b>Missing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Missing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MISSING
	 * @model name="missing"
	 * @generated
	 * @ordered
	 */
	public static final int MISSING_VALUE = 1;

	/**
	 * The '<em><b>Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Template</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPLATE
	 * @model name="template"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPLATE_VALUE = 2;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 3;

	/**
	 * The '<em><b>Withheld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Withheld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WITHHELD
	 * @model name="withheld"
	 * @generated
	 * @ordered
	 */
	public static final int WITHHELD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Nil Reason Enumeration Member0</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NilReasonEnumerationMember0[] VALUES_ARRAY =
		new NilReasonEnumerationMember0[]
		{
			INAPPLICABLE,
			MISSING,
			TEMPLATE,
			UNKNOWN,
			WITHHELD,
		};

	/**
	 * A public read-only list of all the '<em><b>Nil Reason Enumeration Member0</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NilReasonEnumerationMember0> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nil Reason Enumeration Member0</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NilReasonEnumerationMember0 get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			NilReasonEnumerationMember0 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nil Reason Enumeration Member0</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NilReasonEnumerationMember0 getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			NilReasonEnumerationMember0 result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nil Reason Enumeration Member0</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NilReasonEnumerationMember0 get(int value)
	{
		switch (value)
		{
			case INAPPLICABLE_VALUE: return INAPPLICABLE;
			case MISSING_VALUE: return MISSING;
			case TEMPLATE_VALUE: return TEMPLATE;
			case UNKNOWN_VALUE: return UNKNOWN;
			case WITHHELD_VALUE: return WITHHELD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NilReasonEnumerationMember0(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //NilReasonEnumerationMember0
