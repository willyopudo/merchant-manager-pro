package org.arispay.repository.fbl;

import org.arispay.entity.fbl.BulkTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;

public interface BulkTransactionRepository extends JpaRepository<BulkTransaction, Long> {
    @Modifying
    @Query("UPDATE BulkTransaction b SET b.status = :status, b.statusDescription = :statusDescription, b.cbsRef = :cbsRef, b.processFlg = :processFlg, b.processTime= :processTime WHERE b.id = :id")
    void updateStatus(@Param("id") Long id,
                      @Param("status") String status,
                      @Param("statusDescription") String statusDescription,
                      @Param("cbsRef") String cbsRef,
                      @Param("processFlg") String processFlg,
                      @Param("processTime") Timestamp processTime);
}
