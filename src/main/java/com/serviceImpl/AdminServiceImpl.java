package com.serviceImpl;

import com.dao.mapper.AdminMapper;
import com.entity.dto.Admin.GetStorageDTO;
import com.service.AdminService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@Service
public class AdminServiceImpl implements AdminService {
    private final AdminMapper adminMapper;

    public AdminServiceImpl(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public List<GetStorageDTO> getStorage(Integer adminId) {

        return this.adminMapper.getStorage(adminId);
    }
}
