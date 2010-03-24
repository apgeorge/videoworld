package com.thoughtworks.videorental.repository;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;

import com.thoughtworks.repository.SetBasedRepository;
import com.thoughtworks.specification.OrderComparator;
import com.thoughtworks.specification.Specification;
import com.thoughtworks.videorental.domain.Customer;
import com.thoughtworks.videorental.domain.repository.CustomerRepository;

public class SetBasedCustomerRepository extends SetBasedRepository<Customer> implements
		CustomerRepository {

	public SetBasedCustomerRepository(final Collection<Customer> customers) {
		super(customers);
	}
	
	@Override
	public Set<Customer> selectAll(OrderComparator<Customer> comparator) {
		return selectAll((Comparator<Customer>) comparator);
	}

	@Override
	public Set<Customer> selectSatisfying(
			Specification<Customer> specification,
			OrderComparator<Customer> comparator) {
		return selectSatisfying(specification, (Comparator<Customer>) comparator);
	}

}