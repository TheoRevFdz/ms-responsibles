package nttdata.bootcamp.mscustomeraccount.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nttdata.bootcamp.mscustomeraccount.config.CustomerRestConfig;
import nttdata.bootcamp.mscustomeraccount.dto.CustomerDTO;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRestConfig customerRest;

    @Override
    public Optional<CustomerDTO> findCustomerById(String id) {
        Map<String, String> pathVar = new HashMap<String, String>();
        pathVar.put("id", id);
        String uri = "http://localhost:8090/api/customers/{id}";
        CustomerDTO dto = customerRest.getForObject(
                uri,
                CustomerDTO.class,
                pathVar);
        return Optional.ofNullable(dto);
    }

}
