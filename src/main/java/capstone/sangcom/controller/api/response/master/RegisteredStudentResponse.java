package capstone.sangcom.controller.api.response.master;

import capstone.sangcom.entity.dto.masterSection.RegisteredStudentDTO;
import lombok.Data;

import java.util.List;

@Data
public class RegisteredStudentResponse {
    private final boolean success;
    private final List<RegisteredStudentDTO> data;
}
