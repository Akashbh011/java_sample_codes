#include <stdio.h>
#include <winsock2.h>
#include <ws2tcpip.h>
#include <stdlib.h>
#include <string.h>

#pragma comment(lib, "ws2_32.lib")

#define W 5

char a[10];
char b[10];

void alpha9(int);

int main() {
    int s, f, wl, c = 1, i = 0, p = 0, e = 0;
    struct sockaddr_in ser;
    WSADATA wsa;

    if (WSAStartup(MAKEWORD(2, 2), &wsa) != 0) {
        printf("Failed to initialize Winsock\n");
        return 1;
    }

    s = socket(AF_INET, SOCK_STREAM, 0);
    if (s == INVALID_SOCKET) {
        printf("Socket creation error\n");
        WSACleanup();
        return 1;
    }

    ser.sin_family = AF_INET;
    ser.sin_port = htons(6500);
    ser.sin_addr.s_addr = inet_addr("127.0.0.1");

    if (connect(s, (struct sockaddr*)&ser, sizeof(ser)) == SOCKET_ERROR) {
        printf("Connection error\n");
        closesocket(s);
        WSACleanup();
        return 1;
    }

    printf("TCP Connection Established.\n");
    printf("Enter the number of Frames: ");
    scanf("%d", &f);
    alpha9(f);
    send(s, a, sizeof(a), 0);
    strcpy(b, "Time Out ");

    while (1) {
        for (i = 0; i < W; i++) {
            alpha9(c);
            send(s, a, sizeof(a), 0);
            if (c <= f) {
                printf("\nFrame %d Sent", c);
                c++;
            }
        }

        i = 0;
        wl = W;

        while (i < W) {
            recv(s, a, sizeof(a), 0);
            p = atoi(a);
            if (strcmp(a, b) == 0) {
                e = c - wl;
                if (e < f) {
                    printf("\nTime Out, Resent Frame %d onwards", e);
                }
                break;
            } else {
                if (p <= f) {
                    printf("\nFrame %s Acknowledged", a);
                    wl--;
                } else {
                    break;
                }
            }

            if (p > f) {
                break;
            }
            i++;
        }

        if (wl == 0 && c > f) {
            send(s, b, sizeof(b), 0);
            break;
        } else {
            c = c - wl;
            wl = W;
        }
    }

    closesocket(s);
    WSACleanup();
    return 0;
}

void alpha9(int z) {
    int k, i = 0, j, g;
    k = z;
    while (k > 0) {
        i++;
        k = k / 10;
    }
    g = i;
    i--;
    while (z > 0) {
        k = z % 10;
        a[i] = k + 48;
        i--;
        z = z / 10;
    }
    a[g] = '\0';
}