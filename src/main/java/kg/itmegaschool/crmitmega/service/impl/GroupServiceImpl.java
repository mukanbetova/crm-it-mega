package kg.itmegaschool.crmitmega.service.impl;


import kg.itmegaschool.crmitmega.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor


public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;

    private MentorService mentorService;
    private GroupService groupService;
}
