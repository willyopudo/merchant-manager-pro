package org.arispay.mappers;

import java.util.List;

import org.arispay.adapters.ClientJpaAdapter;
import org.arispay.data.TransactionDto;
import org.arispay.entity.Client;
import org.arispay.entity.Transaction;
import org.arispay.repository.ClientRepository;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = ClientRepository.class)
public abstract class TransactionMapper {

    @Autowired
    protected ClientRepository clientRepository;

    @Mapping(source = "client", target = "client", qualifiedByName = "clientToId")
    @Mapping(source = "id", target = "arisTranRef", qualifiedByName = "tranIdToArisTranRef")
    abstract TransactionDto transactionToTransactionDto(Transaction transaction);

    @Mapping(source = "client", target = "client", qualifiedByName = "idToClient")
    abstract Transaction transactionDtoToTransaction(TransactionDto transactionDto);

    @Mapping(source = "client", target = "client", qualifiedByName = "clientToId")
    @Mapping(source = "id", target = "arisTranRef", qualifiedByName = "tranIdToArisTranRef")
    abstract List<TransactionDto> transactionListToTransactionDtoList(List<Transaction> clientList);

    @Mapping(source = "client", target = "client", qualifiedByName = "idToClient")
    abstract List<Transaction> transactionDtoListToTransactionList(List<TransactionDto> ClientDtoList);

    @Named("idToClient")
    public Client idToClient(long id) {
        return clientRepository.getReferenceById(id);
    }

    @Named("clientToId")
    public static Long clientToId(Client client) {
        return client.getId();
    }

    @Named("tranIdToArisTranRef")
    public static String tranIdToArisTranRef(long id) {
        return "ARIS" + String.format("%0" + 9 + "d", id);
    }
}
