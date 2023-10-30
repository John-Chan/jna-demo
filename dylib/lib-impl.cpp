#include "dylib.h"
#include <cstdio>
#include <cstring>


const char* dump_hex(const void* data,unsigned int data_len,char* buff){
    const char * hex = "0123456789ABCDEF";
    const unsigned char * u8_ptr = (const unsigned char *)data;
    unsigned int pos=0;
    while(pos < data_len){
        unsigned char val = u8_ptr[pos];
        buff[pos*2] = hex[(val>>4) & 0xF];
        buff[pos*2 + 1] = hex[ val     & 0xF];
        pos++;
    }
    return buff;
}

	BYTE	IV[MAX_IV_LEN];			
	ULONG	IVLen;					
	ULONG	PaddingType;			
	ULONG	FeedBitLen;		

#define     HEX_BUF_LEN 2048

ULONG DYLIB_API test_init (HANDLE hKey, BLOCKCIPHERPARAM param){
    char buff[HEX_BUF_LEN];
    printf("================================[lib-impl::test_init]================================\n");
    printf("hKey address: %p\n", hKey);
    printf("hKey address: %p\n", &param);
    memset(buff,0,HEX_BUF_LEN);
    printf("param.IV: %s\n", dump_hex(param.IV,MAX_IV_LEN,buff));
    printf("param.IVLen: %u\n", param.IVLen);
    printf("param.PaddingType: %u\n", param.PaddingType);
    printf("param.FeedBitLen: %u\n", param.FeedBitLen);
    return 0;
}


