/**
 */
package rootElement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rootElement.RootElementFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RootElement'"
 * @generated
 */
public interface RootElementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rootElement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///rootElement.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rootElement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootElementPackage eINSTANCE = rootElement.impl.RootElementPackageImpl.init();

	/**
	 * The meta object id for the '{@link rootElement.impl.DataType1Impl <em>Data Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rootElement.impl.DataType1Impl
	 * @see rootElement.impl.RootElementPackageImpl#getDataType1()
	 * @generated
	 */
	int DATA_TYPE1 = 0;

	/**
	 * The number of structural features of the '<em>Data Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rootElement.impl.Class1Impl <em>Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rootElement.impl.Class1Impl
	 * @see rootElement.impl.RootElementPackageImpl#getClass1()
	 * @generated
	 */
	int CLASS1 = 1;

	/**
	 * The number of structural features of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rootElement.impl.DataType2Impl <em>Data Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rootElement.impl.DataType2Impl
	 * @see rootElement.impl.RootElementPackageImpl#getDataType2()
	 * @generated
	 */
	int DATA_TYPE2 = 2;

	/**
	 * The feature id for the '<em><b>Datatype1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE2__DATATYPE1 = 0;

	/**
	 * The number of structural features of the '<em>Data Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rootElement.impl.Component1Impl <em>Component1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rootElement.impl.Component1Impl
	 * @see rootElement.impl.RootElementPackageImpl#getComponent1()
	 * @generated
	 */
	int COMPONENT1 = 3;

	/**
	 * The number of structural features of the '<em>Component1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rootElement.impl.DataType3Impl <em>Data Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rootElement.impl.DataType3Impl
	 * @see rootElement.impl.RootElementPackageImpl#getDataType3()
	 * @generated
	 */
	int DATA_TYPE3 = 4;

	/**
	 * The number of structural features of the '<em>Data Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE3_FEATURE_COUNT = CLASS1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE3_OPERATION_COUNT = CLASS1_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link rootElement.DataType1 <em>Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type1</em>'.
	 * @see rootElement.DataType1
	 * @generated
	 */
	EClass getDataType1();

	/**
	 * Returns the meta object for class '{@link rootElement.Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class1</em>'.
	 * @see rootElement.Class1
	 * @generated
	 */
	EClass getClass1();

	/**
	 * Returns the meta object for class '{@link rootElement.DataType2 <em>Data Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type2</em>'.
	 * @see rootElement.DataType2
	 * @generated
	 */
	EClass getDataType2();

	/**
	 * Returns the meta object for the containment reference '{@link rootElement.DataType2#getDatatype1 <em>Datatype1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype1</em>'.
	 * @see rootElement.DataType2#getDatatype1()
	 * @see #getDataType2()
	 * @generated
	 */
	EReference getDataType2_Datatype1();

	/**
	 * Returns the meta object for class '{@link rootElement.Component1 <em>Component1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component1</em>'.
	 * @see rootElement.Component1
	 * @generated
	 */
	EClass getComponent1();

	/**
	 * Returns the meta object for class '{@link rootElement.DataType3 <em>Data Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type3</em>'.
	 * @see rootElement.DataType3
	 * @generated
	 */
	EClass getDataType3();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RootElementFactory getRootElementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rootElement.impl.DataType1Impl <em>Data Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rootElement.impl.DataType1Impl
		 * @see rootElement.impl.RootElementPackageImpl#getDataType1()
		 * @generated
		 */
		EClass DATA_TYPE1 = eINSTANCE.getDataType1();

		/**
		 * The meta object literal for the '{@link rootElement.impl.Class1Impl <em>Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rootElement.impl.Class1Impl
		 * @see rootElement.impl.RootElementPackageImpl#getClass1()
		 * @generated
		 */
		EClass CLASS1 = eINSTANCE.getClass1();

		/**
		 * The meta object literal for the '{@link rootElement.impl.DataType2Impl <em>Data Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rootElement.impl.DataType2Impl
		 * @see rootElement.impl.RootElementPackageImpl#getDataType2()
		 * @generated
		 */
		EClass DATA_TYPE2 = eINSTANCE.getDataType2();

		/**
		 * The meta object literal for the '<em><b>Datatype1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE2__DATATYPE1 = eINSTANCE.getDataType2_Datatype1();

		/**
		 * The meta object literal for the '{@link rootElement.impl.Component1Impl <em>Component1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rootElement.impl.Component1Impl
		 * @see rootElement.impl.RootElementPackageImpl#getComponent1()
		 * @generated
		 */
		EClass COMPONENT1 = eINSTANCE.getComponent1();

		/**
		 * The meta object literal for the '{@link rootElement.impl.DataType3Impl <em>Data Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rootElement.impl.DataType3Impl
		 * @see rootElement.impl.RootElementPackageImpl#getDataType3()
		 * @generated
		 */
		EClass DATA_TYPE3 = eINSTANCE.getDataType3();

	}

} //RootElementPackage
