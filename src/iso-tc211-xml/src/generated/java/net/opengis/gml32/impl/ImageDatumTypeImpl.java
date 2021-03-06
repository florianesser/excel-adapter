/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.CodeWithAuthorityType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.ImageDatumType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Datum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.ImageDatumTypeImpl#getPixelInCell <em>Pixel In Cell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageDatumTypeImpl extends AbstractDatumTypeImpl implements ImageDatumType
{
	/**
	 * The cached value of the '{@link #getPixelInCell() <em>Pixel In Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelInCell()
	 * @generated
	 * @ordered
	 */
	protected CodeWithAuthorityType pixelInCell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageDatumTypeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return GMLPackage.eINSTANCE.getImageDatumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeWithAuthorityType getPixelInCell()
	{
		return pixelInCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixelInCell(CodeWithAuthorityType newPixelInCell, NotificationChain msgs)
	{
		CodeWithAuthorityType oldPixelInCell = pixelInCell;
		pixelInCell = newPixelInCell;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.IMAGE_DATUM_TYPE__PIXEL_IN_CELL, oldPixelInCell, newPixelInCell);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixelInCell(CodeWithAuthorityType newPixelInCell)
	{
		if (newPixelInCell != pixelInCell)
		{
			NotificationChain msgs = null;
			if (pixelInCell != null)
				msgs = ((InternalEObject)pixelInCell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.IMAGE_DATUM_TYPE__PIXEL_IN_CELL, null, msgs);
			if (newPixelInCell != null)
				msgs = ((InternalEObject)newPixelInCell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.IMAGE_DATUM_TYPE__PIXEL_IN_CELL, null, msgs);
			msgs = basicSetPixelInCell(newPixelInCell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.IMAGE_DATUM_TYPE__PIXEL_IN_CELL, newPixelInCell, newPixelInCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case GMLPackage.IMAGE_DATUM_TYPE__PIXEL_IN_CELL:
				return basicSetPixelInCell(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case GMLPackage.IMAGE_DATUM_TYPE__PIXEL_IN_CELL:
				return getPixelInCell();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case GMLPackage.IMAGE_DATUM_TYPE__PIXEL_IN_CELL:
				setPixelInCell((CodeWithAuthorityType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case GMLPackage.IMAGE_DATUM_TYPE__PIXEL_IN_CELL:
				setPixelInCell((CodeWithAuthorityType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case GMLPackage.IMAGE_DATUM_TYPE__PIXEL_IN_CELL:
				return pixelInCell != null;
		}
		return super.eIsSet(featureID);
	}

} //ImageDatumTypeImpl
