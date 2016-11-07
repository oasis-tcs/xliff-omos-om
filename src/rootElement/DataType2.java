/**
 */
package rootElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rootElement.DataType2#getDatatype1 <em>Datatype1</em>}</li>
 * </ul>
 *
 * @see rootElement.RootElementPackage#getDataType2()
 * @model
 * @generated
 */
public interface DataType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatype1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype1</em>' containment reference.
	 * @see #setDatatype1(DataType1)
	 * @see rootElement.RootElementPackage#getDataType2_Datatype1()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='datatype2'"
	 * @generated
	 */
	DataType1 getDatatype1();

	/**
	 * Sets the value of the '{@link rootElement.DataType2#getDatatype1 <em>Datatype1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype1</em>' containment reference.
	 * @see #getDatatype1()
	 * @generated
	 */
	void setDatatype1(DataType1 value);

} // DataType2
