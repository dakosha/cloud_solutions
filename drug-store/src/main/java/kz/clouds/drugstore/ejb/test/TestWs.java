package kz.clouds.drugstore.ejb.test;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;

import kz.clouds.drugstore.ejb.business.PersonController;
import kz.clouds.drugstore.ejb.dictionaries.NomenclatureController;
import kz.clouds.drugstore.ejb.dictionaries.NomenclatureGroupController;
import kz.clouds.drugstore.ejb.dictionaries.PositionController;
import kz.clouds.drugstore.entities.dictionaries.Nomenclature;
import kz.clouds.drugstore.entities.dictionaries.NomenclatureGroup;
import kz.clouds.drugstore.entities.dictionaries.Position;
import kz.clouds.drugstore.entities.business.Person;


@WebService
public class TestWs {

	@Inject NomenclatureGroupController bean;
	@Inject NomenclatureController nomBean;
	@Inject PositionController posBean;
	@Inject PersonController personBean;
	
	@WebMethod
	public void createGroup(NomenclatureGroup obj) throws SOAPException {
		try {
			bean.create(obj);
		}
		catch (Exception ex) {
			SOAPFault fa = SOAPFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createFault(); 
			fa.setFaultCode("12");
			fa.setFaultString("dublicate");
			throw new SOAPFaultException(fa);
		}
	}
	
	@WebMethod
	public List<NomenclatureGroup> getGroups() throws SOAPException {
		try {
			return bean.getAll(NomenclatureGroup.class, "name");
		}
		catch (Exception ex) {
			SOAPFault fa = SOAPFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createFault(); 
			fa.setFaultCode("12");
			fa.setFaultString("dublicate");
			throw new SOAPFaultException(fa);
		}
	}
	
	@WebMethod
	public void deleteGroup(long id) throws SOAPException {
		try {
			bean.delete(NomenclatureGroup.class,id);
		}
		catch (Exception ex) {
			SOAPFault fa = SOAPFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createFault(); 
			fa.setFaultCode("12");
			fa.setFaultString("dublicate");
			throw new SOAPFaultException(fa);
		}
	}
	
	@WebMethod
	public void createNom(Nomenclature obj) throws SOAPException {
		try {
			nomBean.create(obj);
		}
		catch (Exception ex) {
			SOAPFault fa = SOAPFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createFault(); 
			fa.setFaultCode("12");
			fa.setFaultString("dublicate");
			throw new SOAPFaultException(fa);
		}
	}
	
	@WebMethod
	public void createPos(Position obj) throws SOAPException {
		try {
			posBean.create(obj);
		}
		catch (Exception ex) {
			SOAPFault fa = SOAPFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createFault(); 
			fa.setFaultCode("12");
			fa.setFaultString("dublicate");
			throw new SOAPFaultException(fa);
		}
	}
	
	@WebMethod
	public void createPerson(Person obj) throws SOAPException {
		try {
			personBean.create(obj);
		}
		catch (Exception ex) {
			SOAPFault fa = SOAPFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createFault(); 
			fa.setFaultCode("12");
			fa.setFaultString("dublicate");
			throw new SOAPFaultException(fa);
		}
	}
	
}
