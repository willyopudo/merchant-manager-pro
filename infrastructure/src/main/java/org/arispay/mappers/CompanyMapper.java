package org.arispay.mappers;

import org.arispay.data.CompanyDto;
import org.arispay.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CompanyMapper {
	CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

	CompanyDto companyToCompanyDto(Company company);

	Company companyDtoToCompany(CompanyDto companyDto);

	List<CompanyDto> companyListToCompanyDtoList(List<Company> companyList);

	List<Company> CompanyDtoListTocompanyList(List<CompanyDto> CompanyDtoList);
}
