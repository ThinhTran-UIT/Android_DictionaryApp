package uit.final_project.dictionaryapp;

import uit.final_project.dictionaryapp.Models.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);
}
