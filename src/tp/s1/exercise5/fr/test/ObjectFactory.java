
package fr.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://www.test.fr", "add");
    private final static QName _GetInfoResponse_QNAME = new QName("http://www.test.fr", "getInfoResponse");
    private final static QName _RemoveI_QNAME = new QName("http://www.test.fr", "removeI");
    private final static QName _AddResponse_QNAME = new QName("http://www.test.fr", "addResponse");
    private final static QName _GetList_QNAME = new QName("http://www.test.fr", "getList");
    private final static QName _GetListResponse_QNAME = new QName("http://www.test.fr", "getListResponse");
    private final static QName _GetInfo_QNAME = new QName("http://www.test.fr", "getInfo");
    private final static QName _RemoveS_QNAME = new QName("http://www.test.fr", "removeS");
    private final static QName _RemoveSResponse_QNAME = new QName("http://www.test.fr", "removeSResponse");
    private final static QName _RemoveIResponse_QNAME = new QName("http://www.test.fr", "removeIResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link GetInfoResponse }
     * 
     */
    public GetInfoResponse createGetInfoResponse() {
        return new GetInfoResponse();
    }

    /**
     * Create an instance of {@link RemoveI }
     * 
     */
    public RemoveI createRemoveI() {
        return new RemoveI();
    }

    /**
     * Create an instance of {@link GetInfo }
     * 
     */
    public GetInfo createGetInfo() {
        return new GetInfo();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link RemoveIResponse }
     * 
     */
    public RemoveIResponse createRemoveIResponse() {
        return new RemoveIResponse();
    }

    /**
     * Create an instance of {@link RemoveS }
     * 
     */
    public RemoveS createRemoveS() {
        return new RemoveS();
    }

    /**
     * Create an instance of {@link RemoveSResponse }
     * 
     */
    public RemoveSResponse createRemoveSResponse() {
        return new RemoveSResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "getInfoResponse")
    public JAXBElement<GetInfoResponse> createGetInfoResponse(GetInfoResponse value) {
        return new JAXBElement<GetInfoResponse>(_GetInfoResponse_QNAME, GetInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "removeI")
    public JAXBElement<RemoveI> createRemoveI(RemoveI value) {
        return new JAXBElement<RemoveI>(_RemoveI_QNAME, RemoveI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "getInfo")
    public JAXBElement<GetInfo> createGetInfo(GetInfo value) {
        return new JAXBElement<GetInfo>(_GetInfo_QNAME, GetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "removeS")
    public JAXBElement<RemoveS> createRemoveS(RemoveS value) {
        return new JAXBElement<RemoveS>(_RemoveS_QNAME, RemoveS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "removeSResponse")
    public JAXBElement<RemoveSResponse> createRemoveSResponse(RemoveSResponse value) {
        return new JAXBElement<RemoveSResponse>(_RemoveSResponse_QNAME, RemoveSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "removeIResponse")
    public JAXBElement<RemoveIResponse> createRemoveIResponse(RemoveIResponse value) {
        return new JAXBElement<RemoveIResponse>(_RemoveIResponse_QNAME, RemoveIResponse.class, null, value);
    }

}
