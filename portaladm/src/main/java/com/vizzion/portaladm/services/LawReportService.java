package com.vizzion.portaladm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Service
public class LawReportService {

    @Autowired
    private UserService userService;

    @Autowired
    private ReportService reportService;

    public RestTemplate restTemplate = new RestTemplate();


    //funções para validação jurídca e extração de dados do pdf
    //Alem disso chama um RestTemplate para call de novas apis



    public byte[] extractTxtOfPdf(byte pdf){
        ApiClient apiClient = new ApiClient("####-####-####-####-####",
                "##################", null);
        WordsApi wordsApi = new WordsApi(apiClient);

        byte[] doc = Files.readAllBytes(Paths.get("Input.pdf").toAbsolutePath());
        ConvertDocumentRequest request = new ConvertDocumentRequest(
                doc, "txt", null, null, null, null);
        ConvertDocument convert = wordsApi.convertDocument(request);
    }


}
